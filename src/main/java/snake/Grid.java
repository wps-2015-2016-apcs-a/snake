

public class Grid
{
    Grid[][] grid = new Grid[100][75];
    Grid space = null;
    Grid wall;
    Grid body;
    Grid head;
    Grid food;
        
    public void createGrid()
    {
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 75; j++)
            {
                if (i==0 || i==99 || j==0 || j == 74)
                {
                    grid[i][j] = wall;
                }
                else
                    grid[i][j] = space;
            }
        }
    }
    public void addFood()
    {
        int rowFood = (int)(Math.random() + 100);
        int colFood = (int)(Math.random() + 100);
        if(grid[rowFood][colFood] == body || grid[rowFood][colFood] == head)
            addFood();
    }
}
