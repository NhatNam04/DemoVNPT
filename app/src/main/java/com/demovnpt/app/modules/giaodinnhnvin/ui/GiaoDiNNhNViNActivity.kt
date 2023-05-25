package com.demovnpt.app.modules.giaodinnhnvin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.base.BaseActivity
import com.demovnpt.app.databinding.ActivityGiaoDiNNhNViNBinding
import com.demovnpt.app.modules.giaodinnhnvin.`data`.model.SpinnerThngCounterModel
import com.demovnpt.app.modules.giaodinnhnvin.`data`.viewmodel.GiaoDiNNhNViNVM
import com.demovnpt.app.modules.qunlbnhngsimding.ui.QuNLBNHNgSimDiNgActivity
import com.demovnpt.app.modules.thngtinnhnvin.ui.ThNgTinNhNViNActivity
import kotlin.String
import kotlin.Unit

class GiaoDiNNhNViNActivity :
    BaseActivity<ActivityGiaoDiNNhNViNBinding>(R.layout.activity_giao_di_n_nh_n_vi_n) {
  private val viewModel: GiaoDiNNhNViNVM by viewModels<GiaoDiNNhNViNVM>()

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
    binding.giaoDiNNhNViNVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnsimding.setOnClickListener {
      val destIntent = QuNLBNHNgSimDiNgActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMorehorizontal.setOnClickListener {
      val destIntent = ThNgTinNhNViNActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GIAO_DI_N_NH_N_VI_N_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GiaoDiNNhNViNActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
