package com.example.todolist.repository

import androidx.lifecycle.LiveData
import com.example.todolist.database.TaskDao
import com.example.todolist.database.TaskEntry

class TaskRepository(val taskDao: TaskDao) {
    suspend fun insert(taskEntry: TaskEntry) = taskDao.insert(taskEntry)
    suspend fun updateData(taskEntry: TaskEntry) = taskDao.update(taskEntry)
    suspend fun deleteItem(taskEntry: TaskEntry) = taskDao.delete(taskEntry)

    suspend fun deleteAll() {
        taskDao.deleteAll()
    }

    fun getAllTasks(): LiveData<List<TaskEntry>> = taskDao.getAllTasks()
}