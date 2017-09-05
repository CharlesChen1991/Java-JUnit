package rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by hao.e.chen on 9/5/2017.
 * Be careful that the path of the folder. It will under the user folder
 */
public class TemporaryFolderRule {
    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    /**
     * Be careful that the folder is not promised to be deleted successfully.
     * Starting with version 4.13 TemporaryFolder optionally allows strict verification of deleted resources which
     * fails the test with AssertionError if resources cannot be deleted. This feature can only be opted for by using
     * the #builder() method. By default strict verification is disabled which maintains backward compatibility.
     *
     * @throws IOException
     * @Rule public TemporaryFolder folder = TemporaryFolder.builder().assureDeletion().build();
     */
    @Test
    public void createFolder() throws IOException {
        File createdFile = folder.newFile("myfile.txt");
        File createdFolder = folder.newFolder("subfolder");
        assertTrue(createdFile.exists());
        assertTrue(createdFolder.exists());
    }
}
