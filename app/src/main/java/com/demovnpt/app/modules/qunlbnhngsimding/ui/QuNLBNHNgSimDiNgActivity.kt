package com.demovnpt.app.modules.qunlbnhngsimding.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.base.BaseActivity
import com.demovnpt.app.databinding.ActivityQuNLBNHNgSimDiNgBinding
import com.demovnpt.app.modules.giaodinnhnvin.ui.GiaoDiNNhNViNActivity
import com.demovnpt.app.modules.qunlbnhngsimding.`data`.model.SpinnerThngCounterModel
import com.demovnpt.app.modules.qunlbnhngsimding.`data`.viewmodel.QuNLBNHNgSimDiNgVM
import kotlin.String
import kotlin.Unit

class QuNLBNHNgSimDiNgActivity :
    BaseActivity<ActivityQuNLBNHNgSimDiNgBinding>(R.layout.activity_qu_n_l_b_n_h_ng_sim_di_ng) {
  private val viewModel: QuNLBNHNgSimDiNgVM by viewModels<QuNLBNHNgSimDiNgVM>()

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
    binding.quNLBNHNgSimDiNgVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconparksolid.setOnClickListener {
      val destIntent = GiaoDiNNhNViNActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "QU_N_L_B_N_H_NG_SIM_DI_NG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QuNLBNHNgSimDiNgActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
