package com.devzza.basicstatecodelab.data

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.devzza.basicstatecodelab.compose.WellnessTaskItem


/**
 * Created by: --- Mahmoud Ramzy
 * Email: -------- mahmoudramzy400@gmail.com
 * Date: --------- 25/01/2025
 */


fun getWellnessTasks() = List(30) { i -> WellnessTask(i, label = "Task # $i") }

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember { getWellnessTasks() }
) {

    LazyColumn(modifier = modifier) {

        items(list) { task ->
            WellnessTaskItem(taskName = task.label)
        }
    }

}