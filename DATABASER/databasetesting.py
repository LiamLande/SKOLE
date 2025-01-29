import mysql.connector
from mysql.connector import Error

def query_database(host, database, user, password, sql_query):
    connection = mysql.connector.connect(
            host=host,
            database=database,
            user=user,
            password=password
    )
    try:
        if connection.is_connected():
            print("Connected to the database.")
            cursor = connection.cursor()
            
            # Execute the SQL query
            cursor.execute(sql_query)
            
            # Fetch and print the results
            results = cursor.fetchall()
            for row in results:
                print(row)
    
    except Error as e:
        print(f"Error: {e}")
    finally:
        if connection.is_connected():
            cursor.close()
            connection.close()
            print("Database connection closed.")

# Example usage
if __name__ == "__main__":
    # Replace these with your database credentials
    import xml.etree.ElementTree as ET

    # Load credentials from creds.xml
    tree = ET.parse('creds.xml')
    root = tree.getroot()
    user = root.find('user').find('username').text
    password = root.find('user').find('password').text

    host = "namox.idi.ntnu.no"       # e.g., "127.0.0.1" or "db.example.com"
    database = "liamsl"  # e.g., "test_db"
    
    # SQL query to execute
    sql_query = """
    SELECT * FROM `offices`;
    """  # Replace "your_table_name" with the actual table name
    
    query_database(host, database, user, password, sql_query)
