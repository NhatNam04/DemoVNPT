package com.demovnpt.app.modules.nhpqunlbnhng.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.base.BaseActivity
import com.demovnpt.app.databinding.ActivityNhPQuNLBNHNgBinding
import com.demovnpt.app.modules.giaodinquntr.ui.GiaoDiNQuNTrActivity
import com.demovnpt.app.modules.nhpqunlbnhng.`data`.model.SpinnerMenuTnModel
import com.demovnpt.app.modules.nhpqunlbnhng.`data`.model.SpinnerThngCounterModel
import com.demovnpt.app.modules.nhpqunlbnhng.`data`.viewmodel.NhPQuNLBNHNgVM
import kotlin.String
import kotlin.Unit

class NhPQuNLBNHNgActivity :
    BaseActivity<ActivityNhPQuNLBNHNgBinding>(R.layout.activity_nh_p_qu_n_l_b_n_h_ng) {
  private val viewModel: NhPQuNLBNHNgVM by viewModels<NhPQuNLBNHNgVM>()

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
    viewModel.spinnerMenuTnList.value = mutableListOf(
    SpinnerMenuTnModel("Item1"),
    SpinnerMenuTnModel("Item2"),
    SpinnerMenuTnModel("Item3"),
    SpinnerMenuTnModel("Item4"),
    SpinnerMenuTnModel("Item5")
    )
    val spinnerMenuTnAdapter =
    SpinnerMenuTnAdapter(this,R.layout.spinner_item,viewModel.spinnerMenuTnList.value?:
    mutableListOf())
    binding.spinnerMenuTn.adapter = spinnerMenuTnAdapter
    binding.nhPQuNLBNHNgVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconparksolid.setOnClickListener {
      val destIntent = GiaoDiNQuNTrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NH_P_QU_N_L_B_N_H_NG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NhPQuNLBNHNgActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
