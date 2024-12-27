package com.example.quotescomposeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quotescomposeapp.R
import com.example.quotescomposeapp.models.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>?, onClick: (quote: Quote)-> Unit, listState: LazyListState) {
    val quotes = data ?: emptyArray()

    Column {
        Text("Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(0.dp, 40.dp,0.dp, 8.dp)
                .fillMaxWidth(),
            style = MaterialTheme.typography.headlineSmall,
        )
        QuoteList(quotes, onClick, listState)
    }
}
