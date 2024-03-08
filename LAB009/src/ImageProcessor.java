public class ImageProcessor {
    public void floodFill(int[][] img, int x, int y, int newColor) {
        int oldColor = img[x][y];
        if (oldColor != newColor) {
            fill(img, x, y, oldColor, newColor);
        }
    }

    private void fill(int[][] img, int x, int y, int oldColor, int newColor) {
        if (x < 0 || x >= img.length || y < 0 || y >= img[0].length || img[x][y] != oldColor) {
            return;
        }

        img[x][y] = newColor;

        fill(img, x + 1, y, oldColor, newColor);
        fill(img, x - 1, y, oldColor, newColor);
        fill(img, x, y + 1, oldColor, newColor);
        fill(img, x, y - 1, oldColor, newColor);
    }
}