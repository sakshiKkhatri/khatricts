package company.Album2;



import java.io.IOException;
import java.util.List;

import company.Album2.Entity.Album;


public interface AlbumService {

	public Album createAlbum(Album album);
	public List<Album> getAllAlbums();
	public Album findById(Integer id);
	public Album updateAlbum(Integer id)throws IOException;
	public Album deleteAlbum(Integer id); 
}
