import androidx.compose.ui.Alignment
import androidx.compose.ui.window.*
import ui.rng
import java.awt.Dimension

const val windowSizeWidth = 400
const val windowSizeHeight = 600

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Random Number Generator",
        resizable = false,
        state = WindowState(
            WindowPlacement.Floating,
            false,
            WindowPosition.Aligned(Alignment.Center)
            ),
    ) {
        window.minimumSize = Dimension(windowSizeWidth, windowSizeHeight)
        window.preferredSize = Dimension(windowSizeWidth, windowSizeHeight)
        rng()
    }
}
