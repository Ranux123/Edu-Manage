package Entities;

import java.util.Date;

public class User
{
  private int id;
  private String username;
  private String password;
  private String role;
  private String email;
  private boolean active;
  private Date createdAt;
  private Date updatedAt;

  public User( int id, String username, String password, String role, String email, boolean active, Date createdAt, Date updatedAt )
  {
    this.id = id;
    this.username = username;
    this.password = password;
    this.role = role;
    this.email = email;
    this.active = active;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public int getId()
  {
    return id;
  }

  public void setId( int id )
  {
    this.id = id;
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername( String username )
  {
    this.username = username;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword( String password )
  {
    this.password = password;
  }

  public String getRole()
  {
    return role;
  }

  public void setRole( String role )
  {
    this.role = role;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail( String email )
  {
    this.email = email;
  }

  public boolean isActive()
  {
    return active;
  }

  public void setActive( boolean active )
  {
    this.active = active;
  }

  public Date getCreatedAt()
  {
    return createdAt;
  }

  public void setCreatedAt( Date createdAt )
  {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt()
  {
    return updatedAt;
  }

  public void setUpdatedAt( Date updatedAt )
  {
    this.updatedAt = updatedAt;
  }
}
