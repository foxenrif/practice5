// Класс PhotoAlbum
class PhotoAlbum {
    private int numPages;

    // Конструктор по умолчанию
    public PhotoAlbum() {
        this.numPages = 16; // 16 страниц по умолчанию
    }

    // Конструктор с пользовательским количеством страниц
    public PhotoAlbum(int numPages) {
        this.numPages = numPages;
    }

    // Метод для получения количества страниц
    public int getNumberOfPages() {
        return numPages;
    }
}

// Класс SuperPhotoAlbum, наследуемый от PhotoAlbum
class SuperPhotoAlbum extends PhotoAlbum {
    // Конструктор по умолчанию с 64 страницами
    public SuperPhotoAlbum() {
        super(64);
    }
}

// Тестовый класс AlbumTest
public class AlbumTest {
    public static void main(String[] args) {
        // 1. Фотоальбом по умолчанию
        PhotoAlbum defaultAlbum = new PhotoAlbum();
        System.out.println("Фотоальбом за замовчуванням має " + defaultAlbum.getNumberOfPages() + " сторінок.");

        // 2. Фотоальбом с 24 страницами
        PhotoAlbum customAlbum = new PhotoAlbum(24);
        System.out.println("Фотоальбом із 24 сторінками має " + customAlbum.getNumberOfPages() + " сторінок.");

        // 3. Большой фотоальбом
        SuperPhotoAlbum largeAlbum = new SuperPhotoAlbum();
        System.out.println("Великий фотоальбом має " + largeAlbum.getNumberOfPages() + " сторінок.");
    }
}
