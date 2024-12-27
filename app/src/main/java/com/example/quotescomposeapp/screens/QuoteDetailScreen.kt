package com.example.quotescomposeapp.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.quotescomposeapp.DataManager
import com.example.quotescomposeapp.R
import com.example.quotescomposeapp.models.Quote

@Composable
fun QuoteDetail(quote: Quote) {

    BackHandler {
        DataManager.switchPages(null)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    listOf(
                        Color(0xFFffffff),
                        Color(0xFF8A8A8A)
                    )
                )
            )
    ) {
        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier.padding(32.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp, 24.dp)
            ) {
                Image(
                    painterResource(R.drawable.baseline_format_quote_24),
                    contentDescription = "Quote",
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180F)
                )
                Text(
                    quote.text,
                    style = MaterialTheme.typography.labelLarge,
                )
                Spacer(modifier = Modifier.padding(16.dp))
                Box(
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                Text(
                    quote.author ?: "Unknown Author",
                    style = MaterialTheme.typography.labelLarge,
                )
            }
        }
    }

}

