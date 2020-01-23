package company.Album2;


import java.io.IOException;
import java.util.List;

import company.Album2.Entity.Album;
import company.Album2.Entity.MyImage;


public class AlbumServiceImpl implements AlbumService {

	private AlbumDao dao;
	{
		dao=new AlbumDaoImpl();
	}

	@Override
	public Album createAlbum(Album album) {
		return dao.createAlbum(album);
	}

	@Override
	public List<Album> getAllAlbums() {
		
		return dao.getAllAlbums();
	}

	@Override
	public Album findById(Integer id) {
		
		return dao.findById(id);
	}
	@Override
	public Album updateAlbum(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return dao.updateAlbum(id);
	}


	@Override
	public Album deleteAlbum(Integer id) {
		
		return dao.deleteAlbum(id);
	}

	
	
}
