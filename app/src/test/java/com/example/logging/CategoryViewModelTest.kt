package com.example.logging

import org.junit.Assert.*
import org.junit.Before
import org.junit.jupiter.api.Test

class CategoryViewModelTest {
    private lateinit var viewModel: CategoryViewModel

    @Before
    fun setUp() {
        viewModel = CategoryViewModel()
    }

    @Test
    fun addCategory() {
        val category = Category("Work")
        viewModel.addCategory(category)
        val categories = viewModel.getCategories()
        assertTrue(categories.contains(category))
    }

    @Test
    fun getCategories() {
        val category1 = Category("Work")
        val category2 = Category("Personal")
        viewModel.addCategory(category1)
        viewModel.addCategory(category2)
        val categories = viewModel.getCategories()
        assertEquals(2, categories.size)
        assertTrue(categories.contains(category1))
        assertTrue(categories.contains(category2))
    }
}
