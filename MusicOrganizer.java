import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    /**
     * mostramos una lista con el metodo while
     */
    public void listAllFiles(){
        int index= 0;
        int position =1;
        while(index < files.size()){
            String filename = files.get(index);
            System.out.println(position + filename);
            index++;
            position++;
        }
    }

    /**
     * Aqui a�adimos el metodo listMaching
     */

    public void listMatching(String searchString){
        for(String filename : files){
            if(filename.contains(searchString)){
                System.out.println(filename);
            }
        }
    }

    /**
     * A�adimos el metodo playSamplesArtist
     */

    public void playSamplesArtist(String searchString){
        for(String filename : files){
            if(filename.contains(searchString)){
                System.out.println(filename);
                player.startPlaying(filename);
            }
        }
    }

    /**
     * Localiza el �ndice del primer archivo que se corresponde con
     * la cadena de b�squeda indicada .
     * @param searchString La cadena que hay que buscar.
     * @return El �ndice de la primera aparici�n o -1 si
     * no se encuentra ninguna correspondencia
     */
    public int findFirst(String searchString){
        int index = 0;                  
        boolean searching = true;        
        while (index < files.size() && searching){
            String filename = files.get(index);
            if(filename.contains(searchString)){
                searching = false;
            }
            else{
                index++;
            }           
        }
        if(searching == true){
            index= -1;
        }
        return index;
    }
}

