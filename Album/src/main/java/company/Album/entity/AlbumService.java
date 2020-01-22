package company.Album.entity;

import java.util.List;

public interface AlbumService {
public Album createAlbum (Album album);
public List<Album>getAllAlbum();
public Album getAlbumbyid();
public Album updateAlbum(Integer id )throws Exception;
public void deleteAlbum(Integer id);
}
