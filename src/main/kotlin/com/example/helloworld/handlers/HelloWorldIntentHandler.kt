package com.example.helloworld.handlers

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.impl.IntentRequestHandler
import com.amazon.ask.model.IntentRequest
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.*


class HelloWorldIntentHandler : IntentRequestHandler {
    override fun canHandle(input: HandlerInput, intentRequest: IntentRequest): Boolean {
        return input.matches(Predicates.intentName("HelloWorldIntent"))
    }

    override fun handle(input: HandlerInput, intentRequest: IntentRequest): Optional<Response> {
        return input.responseBuilder
            .withSpeech("Hallo Welt!")
            .build()
    }
}