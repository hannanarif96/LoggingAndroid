package com.example.logging.task

import org.junit.Assert.*
import org.junit.Before
import org.junit.jupiter.api.Test

class TaskViewModelTest {
    private lateinit var viewModel: TaskViewModel

    @Before
    fun setUp() {
        viewModel = TaskViewModel()
    }

    @Test
    fun addTask() {
        val task = Task("Test Task")
        viewModel.addTask(task)
        val tasks = viewModel.getTasks()
        assertTrue(tasks.contains(task))
    }

    @Test
    fun getTasks() {
        val task1 = Task("Task 1")
        val task2 = Task("Task 2")
        viewModel.addTask(task1)
        viewModel.addTask(task2)
        val tasks = viewModel.getTasks()
        assertEquals(2, tasks.size)
        assertTrue(tasks.contains(task1))
        assertTrue(tasks.contains(task2))
    }
}
