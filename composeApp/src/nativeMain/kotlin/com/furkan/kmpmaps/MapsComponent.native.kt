package com.furkan.kmpmaps

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import cocoapods.Google_Maps_iOS_Utils.GMSCameraPosition
import cocoapods.Google_Maps_iOS_Utils.GMSCameraUpdate
import cocoapods.Google_Maps_iOS_Utils.GMSMapView
import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun MapsComponent() {
    val mapView = remember { GMSMapView() }

    val cameraPosition = GMSCameraPosition.cameraWithLatitude(
        1.3588227,
        103.8742114,
        6.0F
    )
    val cameraUpdate = GMSCameraUpdate.setCamera(cameraPosition)
    mapView.moveCamera(cameraUpdate)
}
