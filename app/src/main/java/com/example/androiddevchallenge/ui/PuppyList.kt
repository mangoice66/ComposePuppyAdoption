package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PuppyList(puppyList: List<Puppy>, onPuppyClick: (Puppy) -> Unit = {}) {
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(puppyList) { puppy ->
            PuppyItem(
                puppy,
                Modifier
                    .padding(vertical = 5.dp)
                    .clickable {
                        onPuppyClick(puppy)
                    }
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun PuppyItem(puppy: Puppy, modifier: Modifier = Modifier) {
    Card(modifier, elevation = 8.dp) {
        Row {
            Image(
                painterResource(puppy.picture),
                "Picture of puppy: ${puppy.name}",
                Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text(puppy.name, style = MaterialTheme.typography.h5)
                Text(puppy.size)
                Text(puppy.location, style = MaterialTheme.typography.body2)
            }
        }
    }
}

@Preview
@Composable
fun PuppyItemPreview() {
    MyTheme {
        PuppyItem(
            Puppy(
                "Lily", "A dog", "Young",
                "Adult", "Female", R.drawable.img_puppy_storm, "Sunnyvale, CA"
            )
        )
    }
}