package com.devzza.basicstatecodelab.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.devzza.basicstatecodelab.data.WellnessTask
import com.devzza.basicstatecodelab.data.WellnessTasksList
import com.devzza.basicstatecodelab.viewmodels.WellnessViewModel


/**
 * Created by: --- Mahmoud Ramzy
 * Email: -------- mahmoudramzy400@gmail.com
 * Date: --------- 25/01/2025
 */


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {

        StatefulCounter()
        //val list = remember { getWellnessTasks().toMutableStateList() }

        WellnessTasksList(list = wellnessViewModel.tasks,
            onCheckedTask = {task ,checked ->
                wellnessViewModel.changeTaskChecked(task,checked)

            },
            onCloseTask = { task -> wellnessViewModel.remove(task) })
    }

}

