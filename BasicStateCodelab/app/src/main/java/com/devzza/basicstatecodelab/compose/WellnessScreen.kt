package com.devzza.basicstatecodelab.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devzza.basicstatecodelab.data.WellnessTasksList


/**
 * Created by: --- Mahmoud Ramzy
 * Email: -------- mahmoudramzy400@gmail.com
 * Date: --------- 25/01/2025
 */


@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {

        StatefulCounter()
        WellnessTasksList()
    }

}