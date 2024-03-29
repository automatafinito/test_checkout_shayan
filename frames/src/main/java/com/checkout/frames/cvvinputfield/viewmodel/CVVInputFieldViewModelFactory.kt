package com.checkout.frames.cvvinputfield.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.checkout.base.mapper.Mapper
import com.checkout.frames.cvvinputfield.models.CVVComponentConfig
import com.checkout.frames.style.component.base.InputFieldStyle
import com.checkout.frames.style.view.InputFieldViewStyle
import com.checkout.frames.view.InputFieldState
import com.checkout.validation.api.CVVComponentValidator

@Suppress("UNCHECKED_CAST")
internal class CVVInputFieldViewModelFactory(
    private val config: CVVComponentConfig,
    private val cvvComponentValidator: CVVComponentValidator,
    private val inputFieldStateMapper: Mapper<InputFieldStyle, InputFieldState>,
    private val inputFieldStyleMapper: Mapper<InputFieldStyle, InputFieldViewStyle>,
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CVVInputFieldViewModel::class.java)) {
            return CVVInputFieldViewModel(
                inputFieldStateMapper,
                inputFieldStyleMapper,
                cvvComponentConfig = config,
                cvvComponentValidator = cvvComponentValidator,
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
