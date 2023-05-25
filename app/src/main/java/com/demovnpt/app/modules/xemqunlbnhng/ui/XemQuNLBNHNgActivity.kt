package com.demovnpt.app.modules.xemqunlbnhng.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.base.BaseActivity
import com.demovnpt.app.databinding.ActivityXemQuNLBNHNgBinding
import com.demovnpt.app.modules.giaodinquntr.ui.GiaoDiNQuNTrActivity
import com.demovnpt.app.modules.xembnhngcanhnvin.ui.XemBNHNgCANhNViNActivity
import com.demovnpt.app.modules.xemqunlbnhng.`data`.model.SpinnerThngCounterModel
import com.demovnpt.app.modules.xemqunlbnhng.`data`.viewmodel.XemQuNLBNHNgVM
import kotlin.String
import kotlin.Unit

class XemQuNLBNHNgActivity :
    BaseActivity<ActivityXemQuNLBNHNgBinding>(R.layout.activity_xem_qu_n_l_b_n_h_ng) {
  private val viewModel: XemQuNLBNHNgVM by viewModels<XemQuNLBNHNgVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerThngCounterList.value = mutableListOf(
    SpinnerThngCounterModel("Item1"),
    SpinnerThngCounterModel("Item2"),
    SpinnerThngCounterModel("Item3"),
    SpinnerThngCounterModel("Item4"),
    SpinnerThngCounterModel("Item5")
    )
    val spinnerThngCounterAdapter =
    SpinnerThngCounterAdapter(this,R.layout.spinner_item,viewModel.spinnerThngCounterList.value?:
    mutableListOf())
    binding.spinnerThngCounter.adapter = spinnerThngCounterAdapter
    binding.xemQuNLBNHNgVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconparksolid.setOnClickListener {
      val destIntent = GiaoDiNQuNTrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroup232.setOnClickListener {
      val destIntent = XemBNHNgCANhNViNActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "XEM_QU_N_L_B_N_H_NG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, XemQuNLBNHNgActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
