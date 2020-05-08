package ee.taltech.iti0213.sportsapp.db.domain

import ee.taltech.iti0213.sportsapp.track.TrackType

class User(
    val userId: Long?,
    val username: String,
    val email: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    var speedMode: Boolean = true,
    var defaultActivityType: TrackType = TrackType.UNKNOWN,
    var autoSync: Boolean = true
) {
}