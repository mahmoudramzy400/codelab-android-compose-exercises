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


@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    onCheckedTask : (WellnessTask,Boolean) -> Unit,
    onCloseTask: (WellnessTask) -> Unit,
    list: List<WellnessTask>
) {

    LazyColumn(modifier = modifier) {

        items(items = list,
            key = { task -> task.id }
        ) { task ->
            WellnessTaskItem(taskName = task.label,
                checked =  task.checked,
                onCheckedChange = {checked -> onCheckedTask(task,checked)},
                onClose = { onCloseTask(task) })
        }
    }

}