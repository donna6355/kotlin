package com.donna6355.kidsdrawingapp

import android.Manifest
import android.app.AlertDialog
import android.app.Dialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.view.get
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private var drawingView: DrawingView? = null
    private var mImageButtonCurrentPaint: ImageButton? = null

    // single permission requested
//    private val cameraResultLauncher: ActivityResultLauncher<String> =
//    registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
//        if (isGranted) {
//            Toast.makeText(this, "permission granted for camera", Toast.LENGTH_SHORT).show()
//        } else {
//            Toast.makeText(this, "permission denied for camera", Toast.LENGTH_SHORT).show()
//        }
//    }

    //multi[le permission requested
    private val cameraAndLocationResultLauncher: ActivityResultLauncher<Array<String>> =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            permissions.entries.forEach {
                val permissionName = it.key
                val isGranted = it.value
                if (isGranted) {
                    if (permissionName == Manifest.permission.CAMERA) {
                        Toast.makeText(this, "permission granted for camera", Toast.LENGTH_SHORT)
                            .show()
                    } else {
                        Toast.makeText(this, "permission granted for location", Toast.LENGTH_SHORT)
                            .show()
                    }
                } else {
                    if (permissionName == Manifest.permission.CAMERA) {
                        Toast.makeText(this, "permission denied for camera", Toast.LENGTH_SHORT)
                            .show()
                    } else {
                        Toast.makeText(this, "permission denied for location", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawingView = findViewById(R.id.drawing_view)
        drawingView?.setSizeForBrush(20.toFloat())

        val linearLayoutPaintColors = findViewById<LinearLayout>(R.id.ll_paint_color)
        mImageButtonCurrentPaint = linearLayoutPaintColors[1] as ImageButton
        mImageButtonCurrentPaint!!.setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.pallet_selected
            )
        )

        val ibBrush: ImageButton = findViewById(R.id.ib_brush)
        ibBrush.setOnClickListener { showBrushSizeDialog() }

        //better to check os version and if it denied before
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && shouldShowRequestPermissionRationale(
                Manifest.permission.CAMERA
            )
        ) {
//            Toast.makeText(
//                this,
//                "camera cannot be used as camera access is denied",
//                Toast.LENGTH_SHORT
//            ).show()
            Snackbar.make(ibBrush, "test snackbar!", Snackbar.LENGTH_SHORT).show()
        } else {
//        cameraResultLauncher.launch(Manifest.permission.CAMERA)       //single permission
            cameraAndLocationResultLauncher.launch(
                arrayOf(
                    Manifest.permission.CAMERA,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            )
        }

    }

    private fun showBrushSizeDialog() {
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dialog_brush_size)
        brushDialog.setTitle("Brush Size")

        val smallBtn: ImageButton = brushDialog.findViewById(R.id.ib_small_brush)
        smallBtn.setOnClickListener {
            drawingView?.setSizeForBrush(10.toFloat())
            brushDialog.dismiss()
        }

        val mediumBtn: ImageButton = brushDialog.findViewById(R.id.ib_medium_brush)
        mediumBtn.setOnClickListener {
            drawingView?.setSizeForBrush(20.toFloat())
            brushDialog.dismiss()
        }
        val largeBtn: ImageButton = brushDialog.findViewById(R.id.ib_large_brush)
        largeBtn.setOnClickListener {
            drawingView?.setSizeForBrush(30.toFloat())
            brushDialog.dismiss()
        }
        brushDialog.show()

    }

    fun paintClicked(view: View) {
        if (view !== mImageButtonCurrentPaint) {
            val imageButton = view as ImageButton
            val colorTag = imageButton.tag.toString()
            drawingView?.setColor(colorTag)
            imageButton.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.pallet_selected
                )
            )
            mImageButtonCurrentPaint?.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.pallet_normal
                )
            )
            mImageButtonCurrentPaint = view
        }

    }

    fun alertDialogFunction() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert")
            .setMessage("test alert dialog is working")
            .setIcon(android.R.drawable.ic_dialog_info)
            .setPositiveButton("yes") { dialogInterface, which ->
                Toast.makeText(applicationContext, "yes clicked", Toast.LENGTH_SHORT).show()
                dialogInterface.dismiss()
            }
            .setNegativeButton("no") { dialogInterface, which ->
                Toast.makeText(applicationContext, "no clicked", Toast.LENGTH_SHORT).show()
                dialogInterface.dismiss()
            }
            .setNeutralButton("cancel") { dialogInterface, which ->
                Toast.makeText(applicationContext, "cancel clicked", Toast.LENGTH_SHORT).show()
                dialogInterface.dismiss()
            }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)//will not allow user to cancel when user clicks out side of dialog area
        alertDialog.show()
    }

    fun customDialogFunction() {
        val customDialog = Dialog(this)
        customDialog.setContentView(R.layout.custom_dialog)
        customDialog.findViewById<Button>(R.id.btn_yes).setOnClickListener {
            Toast.makeText(applicationContext, "YES clicked", Toast.LENGTH_SHORT).show()
            customDialog.dismiss()
        }
        customDialog.findViewById<Button>(R.id.btn_no).setOnClickListener {
            Toast.makeText(applicationContext, "NO clicked", Toast.LENGTH_SHORT).show()
            customDialog.dismiss()
        }
        customDialog.show()
    }

    fun customProgressDialog() {
        val customProgressDialog = Dialog(this)
        customProgressDialog.setContentView(R.layout.custom_progress_dialog)
        customProgressDialog.show()
    }
}