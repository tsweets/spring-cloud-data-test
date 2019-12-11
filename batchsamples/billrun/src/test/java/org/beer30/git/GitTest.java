package org.beer30.git;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.junit.Test;

import java.io.File;

public class GitTest {
    @Test
    public void test() throws GitAPIException {
        Git git = Git.init().setDirectory(new File("/tmp/repo")).call();

    }
}
