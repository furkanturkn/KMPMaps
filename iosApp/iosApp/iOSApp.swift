import SwiftUI
import GoogleMaps //add import

@main
struct iOSApp: App {

    //add init block with GMSService
    init() {
        GMSServices.provideAPIKey("YOUR_MAPS_API_KEY")
    }
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}