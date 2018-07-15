package com.tencent.devops.logback

import org.slf4j.LoggerFactory

class Runner {

    private val logger = LoggerFactory.getLogger(Runner::class.java)

    fun execute() {
        logger.info("Start the runner")

        logger.debug("Finish the runner")
    }
}