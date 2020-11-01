package ee.taltech.kilpkonn.sportsapp.component.imageview

import ee.taltech.kilpkonn.sportsapp.R
import ee.taltech.kilpkonn.sportsapp.track.TrackType

class TrackTypeIcons {
    companion object {
        const val UNKNOWN = "Casual drive"
        const val RUNNING = "Taxi"
        const val CYCLING = "Truck simulator"
        const val SKIING = "Bus"
        const val SOCCER = "Bike"
        const val ROWING = "Race mode"
        const val SWIMMING = "GTA"

        val OPTIONS = arrayOf(
            UNKNOWN, RUNNING, CYCLING, SKIING, SOCCER, ROWING, SWIMMING
        )

        fun getTrackType(string: String): TrackType {
            return when(string) {
                UNKNOWN -> TrackType.UNKNOWN
                RUNNING -> TrackType.RUNNING
                CYCLING -> TrackType.CYCLING
                SKIING -> TrackType.SKIING
                SOCCER -> TrackType.SOCCER
                ROWING -> TrackType.ROWING
                SWIMMING -> TrackType.SWIMMING
                else -> TrackType.UNKNOWN
            }
        }

        fun getIcon(trackType: TrackType): Int {
            return when (trackType) {
                TrackType.UNKNOWN -> R.drawable.ic_activity_24px
                TrackType.RUNNING -> R.drawable.ic_run_24px
                TrackType.CYCLING -> R.drawable.ic_bike_24px
                TrackType.SKIING -> R.drawable.ic_skiing
                TrackType.SOCCER -> R.drawable.ic_sports_soccer_24px
                TrackType.ROWING -> R.drawable.ic_rowing_24px
                TrackType.SWIMMING -> R.drawable.ic_swimming_24px
            }
        }

        fun getString(trackType: TrackType): String {
            return when (trackType) {
                TrackType.UNKNOWN -> UNKNOWN
                TrackType.RUNNING -> RUNNING
                TrackType.CYCLING -> CYCLING
                TrackType.SKIING -> SKIING
                TrackType.SOCCER -> SOCCER
                TrackType.ROWING -> ROWING
                TrackType.SWIMMING -> SWIMMING
            }
        }
    }
}