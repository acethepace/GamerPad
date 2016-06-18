import socket


def Main():
    host = input("Enter Android phone IP address:")
    port = input("Enter Android phone port number:")

    mysocket = socket.socket()
    mysocket.bind((host, port))

    mysocket.listen(1)
    conn, addr = mysocket.accept()
    print ("Connection from: " + str(addr))
    while True:
        data = conn.recv(1024).decode()
        if not data:
            break
        print ("from connected  user: " + str(data))

        data = str(data).upper()
        print ("sending: " + str(data))
        conn.send(data.encode())

    conn.close()


if __name__ == '__main__':
    Main()
