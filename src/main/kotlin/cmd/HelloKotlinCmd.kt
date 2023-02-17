package cmd

import com.github.ajalt.clikt.core.CliktCommand
import io.github.cidverse.cid.sdk.CIDSDK

class HelloKotlinCmd(private val sdk: CIDSDK) : CliktCommand(name = "kotlin-hello") {
	override fun run() {
		sdk.log(level = "warn", message = "hello kotlin")
	}
}
