package edu.monmouth.shape;

public class Rectangle implements Shape, Comparable<Rectangle> {
	
	private int width, height;
	private String name;
	
	public Rectangle(String name, int width, int height) 
	{
		setWidth(width);
		setHeight(height);
		setName(name);
	}

	
	public int getWidth() 
	{
		return width;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Rectangle [width=" + width + ", height=" + height + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return name.equals(other.name);
	}

	@Override
	public int compareTo(Rectangle o) 
	{
		if (width < o.width)
		{
			return -1;
		}
		if (width > o.width) 
		{
		return 1;
		}
		if (height < o.height)
		{
			return -1;
		}
		if (height > o.height) 
		{
		return 1;
		}
		return 0;
	}

	@Override
	public double area() 
	{
		return width * height;
	}
}
