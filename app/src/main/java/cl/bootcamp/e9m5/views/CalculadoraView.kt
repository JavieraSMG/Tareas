package cl.bootcamp.e9m5.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cl.bootcamp.e9m5.components.InputBox
import cl.bootcamp.e9m5.components.MainButton
import cl.bootcamp.e9m5.components.ResultText
import cl.bootcamp.e9m5.components.SegmentedButtonSelect
import cl.bootcamp.e9m5.components.Title
import cl.bootcamp.e9m5.components.calculateBMI

@Composable
fun CalculatorScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
            verticalArrangement= Arrangement.Center,
            horizontalAlignment= Alignment.CenterHorizontally,
        )
    {
        var age by remember { mutableStateOf("") }
        var weight by remember { mutableStateOf("") }
        var height by remember { mutableStateOf("") }
        var bmi by remember { mutableStateOf(0.0) }

        Title(text = "Calculadora de IMC")
        SegmentedButtonSelect()
        InputBox(age, { age = it }, "Edad")
        InputBox(weight, { weight = it }, "Peso (Kg)")
        InputBox(height, { height = it }, "Altura (cm)")
        MainButton(){
            if (age!="" && weight!=""  && height!="" ) {
                bmi= calculateBMI( weight.toDouble(), height.toDouble())
            }
        }
        ResultText(bmi)


    }

}

