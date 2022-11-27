package com.example.helloworld

import com.amazon.ask.Skill
import com.amazon.ask.SkillStreamHandler
import com.amazon.ask.Skills
import com.example.helloworld.handlers.*

class RequestHandler(skill: Skill = getSkill()) : SkillStreamHandler(skill) {

    companion object {
        @JvmStatic
        fun getSkill(): Skill {
            return Skills.standard()
                .withSkillId("[insert your skill id here]")
                .addRequestHandlers(
                    LaunchRequestHandler(),
                    HelpIntentHandler(),
                    CancelAndStopIntentHandler(),
                    FallbackIntentHandler(),
                    SessionEndedRequestHandler(),
                    HelloWorldIntentHandler()
                )
                .build()
        }
    }
}
