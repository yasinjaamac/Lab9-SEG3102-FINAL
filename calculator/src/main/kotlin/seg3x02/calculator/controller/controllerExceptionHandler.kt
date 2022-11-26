package seg3x02.calculator.controller


import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
//---YasinJ
class controllerExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleException(ex: Exception): ResponseEntity<String> {
        return ResponseEntity.badRequest().body("Unable to process requested")

    }
}