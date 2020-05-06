package ee.taltech.iti0213.sportsapp.api.dto

import com.fasterxml.jackson.annotation.JsonProperty

class LoginResponseDto(
    @JsonProperty("token")
    var token: String,
    @JsonProperty("status")
    var status: String,
    @JsonProperty("firstName")
    var firstName: String,
    @JsonProperty("lastName")
    var lastName: String
)