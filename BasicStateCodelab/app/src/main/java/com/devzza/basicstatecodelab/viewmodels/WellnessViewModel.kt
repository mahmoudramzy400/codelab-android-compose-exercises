package com.devzza.basicstatecodelab.viewmodels

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.devzza.basicstatecodelab.data.WellnessTask


/**
 * Created by: --- Mahmoud Ramzy
 * Email: -------- mahmoudramzy400@gmail.com
 * Date: --------- 26/01/2025
 */
class WellnessViewModel : ViewModel() {

    private val _tasks = getWellnessTasks().toMutableStateList()

    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(
        item: WellnessTask,
        checked: Boolean
    ) =
        _tasks.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }

}

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, label = "Task # $i") }
