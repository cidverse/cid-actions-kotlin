import cmd.HelloKotlinCmd
import com.github.ajalt.clikt.core.subcommands
import io.github.cidverse.cid.sdk.CIDSDK

fun main(args: Array<String>) {
    val sdk = CIDSDK()

    RootCmd()
        .subcommands(HelloKotlinCmd(sdk))
        .main(args)
}
