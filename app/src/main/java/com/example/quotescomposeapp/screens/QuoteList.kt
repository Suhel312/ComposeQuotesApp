package com.example.quotescomposeapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotescomposeapp.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote)-> Unit, listState: LazyListState) {

    LazyColumn(state = listState) {
        items(data.toList(), key = { "${it.text}-${it.author}" }) { quote ->
            QuoteListItem(quote, onClick)
        }
    }
}