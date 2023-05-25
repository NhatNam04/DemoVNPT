package com.demovnpt.app.modules.ngnhp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.base.BaseActivity
import com.demovnpt.app.databinding.ActivityNgNhPBinding
import com.demovnpt.app.modules.giaodinnhnvin.ui.GiaoDiNNhNViNActivity
import com.demovnpt.app.modules.ngnhp.`data`.viewmodel.NgNhPVM
import com.demovnpt.app.modules.thngtinnhnvin.ui.ThNgTinNhNViNActivity
import kotlin.String
import kotlin.Unit

class NgNhPActivity : BaseActivity<ActivityNgNhPBinding>(R.layout.activity_ng_nh_p) {
  private val viewModel: NgNhPVM by viewModels<NgNhPVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ngNhPVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = ThNgTinNhNViNActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnXcNhn.setOnClickListener {
        val destIntent = GiaoDiNNhNViNActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "NG_NH_P_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, NgNhPActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
