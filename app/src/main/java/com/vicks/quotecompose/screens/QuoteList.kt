package com.vicks.quotecompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.vicks.quotecompose.model.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {

    LazyColumn (content = {
        items(data.size) {
            QuoteListItem(data[it], onClick)
        }
    })
}