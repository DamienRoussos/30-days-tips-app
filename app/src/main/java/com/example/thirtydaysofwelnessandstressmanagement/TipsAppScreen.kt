package com.example.thirtydaysofwelnessandstressmanagement

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.thirtydaysofwelnessandstressmanagement.data.DataSource
import com.example.thirtydaysofwelnessandstressmanagement.model.Tip

@Composable
fun TipsApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Header()
        }
    ) {
        TipsCardList(tips = DataSource().loadTips(), contentPadding = it)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.displaySmall
            )
        },
        modifier = modifier.padding(top = 16.dp, bottom = 16.dp, start = 8.dp)
    )
}

@Composable
fun TipsCardList(
    tips: List<Tip>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(contentPadding = contentPadding) {
        items(tips.size) { tip ->
            TipsCard(tip = tips[tip])
        }
    }
}

@Composable
fun TipsCard(
    tip: Tip,
    modifier: Modifier = Modifier
) {
    var expanded by remember {
        mutableStateOf(false)
    }

    Card(
        modifier = modifier
            .padding(8.dp),
        onClick = { expanded = !expanded }
    ) {
        Column(
            modifier = modifier
                .padding(16.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )
        ) {
            Text(text = stringResource(id = tip.day), modifier.padding(bottom = 4.dp))
            Text(text = stringResource(id = tip.title), modifier.padding(bottom = 8.dp))
            Image(
                painter = painterResource(id = tip.image),
                contentDescription = null,
                modifier
                    .padding(bottom = 8.dp)
                    .clip(
                        RoundedCornerShape(5)
                    )
            )
            if (expanded) {
                Text(text = stringResource(id = tip.description))
            }
        }
    }
}