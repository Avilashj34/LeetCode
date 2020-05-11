// Runtime  is 0ms
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor){
            return image;
        }
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    public void fill(int[][] image, int x, int y, int color, int newColor){
        if(x<0 || x>=image.length || y<0 || y>=image[x].length ||image[x][y] != color){
            return;
        }
        image[x][y] = newColor;
        fill(image, x-1, y, color, newColor);
        fill(image, x, y-1, color, newColor);
        fill(image, x+1, y, color, newColor);
        fill(image, x, y+1, color, newColor);
    }
}



Input: 
image = [[1,1,1],[1,1,0],[1,0,1]]
sr = 1, sc = 1, newColor = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]


1 1 1   |(True)
1 1 0  - -(False bcoz not equal to (1,1) value)
1 0 1   | (False bcoz not equal to (1,1) value)





# runtime is 76ms
class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
        if image[sr][sc] == newColor:
            return image
        
        def fill(image, x, y, color, newColor):
            if x<0 or x>= len(image)or y<0 or y>=len(image[x]) or image[x][y] != color:
                return
            image[x][y] = newColor
            fill(image, x-1, y, color, newColor)
            fill(image, x, y-1, color, newColor)
            fill(image, x+1, y, color, newColor)
            fill(image, x, y+1, color, newColor)
            
        fill(image, sr, sc, image[sr][sc], newColor)
        return image