# Public-API-SDK

# The process of using Sentinel SDK is

1. Register an account at https://xxx.com and wait for review.
2. Contact Sentinel to get the test lock.
3. Add a device group on the API platform
4. Configure the notification address of the device group.
5. Get your Client Id and Secret Key in SEETING-API Authentication
6. Start the test

# 1.1 release note

1. Add start trip and end trip command
2. Added support for sending delayed commands, mainly to solve the problem that offline devices cannot send commands. When the device is offline, a delay command is sent, and when the device is online and within the delay time, the command will continue to be issued. If the device is online, the command will be sent in real time.

