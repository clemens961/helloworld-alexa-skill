package com.example.helloworld.handlers

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.*


class CancelAndStopIntentHandler : RequestHandler {
    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(
            Predicates.intentName("AMAZON.CancelIntent").or(Predicates.intentName("AMAZON.StopIntent"))
        )
    }

    override fun handle(input: HandlerInput): Optional<Response> {
        return input.responseBuilder
            .withSpeech("Bis zum nächsten Mal.")
            .withShouldEndSession(true)
            .build()
    }
}