package practice.group1.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAudioFile {
    @Test
    public void testPathname01() {
        AudioFile audio2 = new AudioFile();
        audio2.parsePathname("file.mp3");
        String pathname2 = audio2.getPathname();
        //System.out.println(pathname2);
        assertEquals("file.mp3", pathname2);
    }
    @Test
    public void testPathname02() {
        AudioFile audio2 = new AudioFile();
        audio2.parsePathname("");
        String pathname2 = audio2.getPathname();
        //System.out.println(pathname2);
        // pathname2 soll "", z.B. pathname2.equals("")
        assertEquals("", pathname2);
    }
    @Test
    public void testPathname03() throws Exception {
        // Wenn Sie die EmulateOtherOs-Klasse aus dem Cert
        // Paket kopieren, können Sie in eigenen Tests diese
        // verwenden. Dafür ist das "throws Exception" notwendig
        // hinter der Methode notwendig.
        EmulateOtherOs.emulateLinux();
        
        AudioFile audio2 = new AudioFile();
        audio2.parsePathname("//your-tmp/part1//file.mp3/");
        String pathname2 = audio2.getPathname();
        //System.out.println(pathname2);
        // pathname2 soll "", z.B. pathname2.equals("")
        assertEquals("", pathname2);
    }
}
