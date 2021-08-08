package m.tech.customview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import m.tech.navigation.DeepLinkNavigation

/**
 * @author 89hnim
 * @since 24/07/2021
 * Just a container class
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navCircularProgressButton(view: View) {
        DeepLinkNavigation.CustomViewScope.navToCircularProgressButton(this)
    }

    fun navCollapsableTextView(view: View) {
        DeepLinkNavigation.CustomViewScope.navToCollapseTextView(this)
    }

    fun navPolygonImageView(view: View) {
        DeepLinkNavigation.CustomViewScope.navToPolygonImageView(this)
    }
}