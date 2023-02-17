package cmd

import io.github.cidverse.cid.sdk.CIDSDK
import io.github.cidverse.cid.sdk.domain.ProjectModule
import io.github.cidverse.cid.sdk.domain.ProjectModuleDiscovery
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class HelloKotlinCmdTest {

    @Test
    fun mockSDK() {
        val sdk: CIDSDK = mock()

        // mock
        whenever(sdk.module()).thenReturn(
            ProjectModule(
                projectDir = "/my-project",
                moduleDir = "/my-project",
                discovery = listOf(
                    ProjectModuleDiscovery("a-file.txt")
                ),
                name = "my project",
                slug = "my-project",
                buildSystem = "gradle",
                buildSystemSyntax = "kotlin",
                language = emptyMap(),
                dependencies = emptyList(),
                submodules = emptyList(),
                files = emptyList(),
            )
        )

        // run
        HelloKotlinCmd(sdk).run()

        // verify
        // verify(sdk).executeCommand(command = "java --version")
    }

}
